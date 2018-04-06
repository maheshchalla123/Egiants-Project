var app = angular.module('blog', ['ngRoute']);

app.config(function($routeProvider,$locationProvider) {
			$routeProvider
			.when("/about1", {
				templateUrl : "Templates/about.html"
			})
			.when("/contact1", {
				templateUrl : "Templates/contact.html"
			})
		});
