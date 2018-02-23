
routerApp.controller('homeContoller', function($scope, $http, myJson) {
    
   $scope.test = "test";

   myJson.all().then(function(resp) {
        $scope.movies = resp;
        
    });

});



routerApp.factory('myJson', ['$http', function ($http){
	var myJson = {};
	myJson.get = $http.get('http://localhost/honeywell/js/data/movielist.json').then(function(resp){
       // console.log(resp);
            return resp.data;
            
	});
	myJson.all = function(){
		return myJson.get;
	};
	return myJson;
}])