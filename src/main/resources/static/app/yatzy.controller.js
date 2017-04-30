/**
 * Created by Emina on 4/2/2017.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .controller('MyController', MyController);

    MyController.$inject = ['$http'];


    function MyController($http) {

        var vm = this;
        vm.players = [];
        vm.historia = [];
        vm.playerstatus=[];
        vm.scores=[];
        vm.round=[];
        vm.games=[];
        vm.dice=[];
        vm.getAll = getAll;
        vm.getHistory = getHistory;
        vm.getPlayerstatus=getPlayerstatus;
        vm.viewHighScores=viewHighScores;
        vm.viewRounds=viewRounds;
        vm.getGames=getGames;
        vm.getDice=getDice;



        init();

        function init(){
            getAll();
            getHistory();
            getPlayerstatus();
            viewHighScores();
            getGames();
            viewRounds();
            getDice();

        }

        function getAll(){
            var url = "/all/players";
            var playersPromise = $http.get(url);
            playersPromise.then(function(response){
               vm.players = response.data;
                console.log([response.data]);
            });
        }

        function getHistory(name){

            var url = "/all/allplayergames/" + name;
            var historiaPromise = $http.get(url);
            console.log([url]);
            historiaPromise.then(function(response){
                vm.historia = response.data;
                console.log([response.data]);
            });
        }



        function getPlayerstatus(id) {
            var url="/all/loser/" + id;
            var playerstatusPromise=$http.get(url);
            playerstatusPromise.then(function (response) {
                vm.playerstatus=response.data;
            });

        }

        function viewHighScores(){

            var url="/all/allplayergames";
            var scorePromise=$http.get(url);
            scorePromise.then(function (response) {
                vm.scores=response.data;
            });
        }

        function getGames() {
            var url="/all/game";
            var gamePromise=$http.get(url);
            gamePromise.then(function (response) {
                vm.games=response.data;
            });
        }

        function viewRounds(gameid) {
            var url="/all/rounds/"+gameid;
            var roundPromise=$http.get(url);
            roundPromise.then(function (response) {
                vm.round=response.data;
            });
        }

        function getDice(diceid) {
            var url="/all/dice/"+diceid;
            var roundPromise=$http.get(url);
            roundPromise.then(function (response) {
                vm.dice=response.data;
            });
        }

    }
})();