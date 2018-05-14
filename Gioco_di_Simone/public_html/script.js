var N = 1;
var LIVELLO_MASSIMO = 10;
var LIVELLO = 1;
var TEMPO_ATTESA = 750; //ms
var TEMPO_GIOCO = 90000; //ms
var TEMPO_COLORI = 10; //secondi
var random_stack = [];
var player_stack = [];
var equals = true;

function newGame() {

	gameCycle();

}

function gameCycle() {

	random_stack = [];
	player_stack = [];
	buttonEnabler(false);

	(function myLoop(i) {
		setTimeout(function () {
			var random = Math.floor((Math.random() * 3) + 1);
			//tre if per riempire lo stack di gestione dei colori
			if (random === 1) {
				random_stack.push("red");
				blink("red");
			}
			if (random === 2) {
				random_stack.push("blue");
				blink("blue");
			}
			if (random === 3) {
				random_stack.push("green");
				blink("green");
			}
			if (--i) {
				myLoop(i); //re-itera la function myLoop se non ha finito
			} else {
				buttonEnabler(true); //se ha finito ri-abilita i bottoni
				player_stack = []; //svuota lo stack con le scelte del giocatore
			}
		}, TEMPO_ATTESA);
	})(LIVELLO + 2);

	var remaining = TEMPO_COLORI;
	
	(function myLoop(i) {
		setTimeout(function () {
			document.getElementById("displayBox").innerHTML = "Secondi rimasti per inserire i colori: " + remaining;
			remaining--;
			equals = true;
			//toDo
			for(var x = 0; x<player_stack.length; x++){
				if(player_stack[x] !== random_stack[x])
					equals = false;
			}
			if (i>=0) {
				i--;
				myLoop(i); //re-itera la function myLoop se non ha finito
			}else{
				document.getElementById("displayBox").innerHTML = "FAIL!";
			}
		}, 1000);
	})(TEMPO_COLORI);//in TEMPO_COLORI secondi bisogna inserire i colori
	
//	if(equals){
//		if(LIVELLO === LIVELLO_MASSIMO)
//			document.getElementById("displayBox").innerHTML = "WIN!";
//		else{
//			LIVELLO++;
//			gameCycle();
//		}
//	}
}

function blink(color) {
	if (color === "red") {
		document.getElementById("redCircle").style.backgroundColor = "crimson";
		setTimeout(function () {
			document.getElementById("redCircle").style.backgroundColor = "white";
		}, 500);
	}
	if (color === "blue") {
		document.getElementById("blueCircle").style.backgroundColor = "cornflowerblue";
		setTimeout(function () {
			document.getElementById("blueCircle").style.backgroundColor = "white";
		}, 500);
	}
	if (color === "green") {
		document.getElementById("greenCircle").style.backgroundColor = "green";
		setTimeout(function () {
			document.getElementById("greenCircle").style.backgroundColor = "white";
		}, 500);
	}

}

function buttonEnabler(enable) {

	document.getElementById("redBtn").disabled = !enable;
	document.getElementById("blueBtn").disabled = !enable;
	document.getElementById("greenBtn").disabled = !enable;

}

function pushPlayerColor(color) {
	player_stack.push(color);
}