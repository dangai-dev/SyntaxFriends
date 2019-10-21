'use strict';

// Initialize modules
const { src, dest, watch, series, parallel } = require('gulp');
const sourcemaps = require('gulp-sourcemaps');
const sass = require('gulp-sass');
const postcss = require('gulp-postcss');
const autoprefixer = require('autoprefixer');
const browserSync = require("browser-sync").create();

// File paths
const files = {
    scssPath: [
        'src/scss/**/*.scss',
        'node_modules/bootstrap/scss/bootstrap.scss'
    ],
    jsPath: [
        'src/js/**/*.js',
        'node_modules/bootstrap/dist/js/bootstrap.min.js',
        'node_modules/popper.js/dist/popper.min.js',
        'node_modules/jquery/dist/jquery.min.js'
    ]
}

// Sass task: compiles the *.scss files into *.css
function scssTask(){
    return src(files.scssPath)
        .pipe(sourcemaps.init()) // initialize sourcemaps first
        .pipe(sass()) // compile SCSS to CSS
        .pipe(postcss([ autoprefixer() ])) // PostCSS plugins
        .pipe(sourcemaps.write('.')) // write sourcemaps file in current directory
        .pipe(dest('build')) // put final CSS in build folder
        .pipe(browserSync.stream());
}

// JS task: put .js files to script.js
function jsTask(){
    return src(files.jsPath)
        .pipe(dest('build'))
        .pipe(browserSync.stream());
}

function browserSyncTask(){
	browserSync.init(["*.css", "*.js"], {
		watch: true,
		server: {
			baseDir: "src",
			index: "index.html"
		},
		serveStatic: ['.', 'src', 'build'],
		serveStaticOptions: {
			extensions: ['css', 'scss', 'html', 'js'] // pretty urls
		}
    });
    
    watch(files.scssPath, scssTask);
    watch(files.jsPath, jsTask);
    watch("src/*.html").on('change', browserSync.reload);
}

// Run command: gulp
exports.default = series(
    parallel(scssTask, jsTask), 
    browserSyncTask
);