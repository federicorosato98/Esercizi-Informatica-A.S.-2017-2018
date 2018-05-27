var LIVELLO_MASSIMO = 10;
var LIVELLO = 1; //livello corrente
var TEMPO_TURNO_GIOCATORE = 10; //secondi
var TEMPO_GIOCO = 300; //secondi
var TEMPO_COLORI = 600; //millisecondi
var random_stack = []; //stack generato
var player_stack = []; //stack con le scelte del giocatore
var equals = true; 
var buttons_enabled = false;


function newGame() {    
    setInterval(startTimer, 1000);
    cycle();
}

async function cycle() {
    
    random_stack = [];
    player_stack = [];
    TEMPO_TURNO_GIOCATORE = 3;
    buttonEnabler(false);
    equals = true;

    
    for(var i = 0; i<LIVELLO +2; i++){
        var random = Math.floor((Math.random() * 3) + 1);
        //tre if per riempire lo stack di gestione dei colori
        if (random === 1) {
            random_stack.push("red");
            await blinkPromise("red");
        }
        if (random === 2) {
            random_stack.push("blue");
            await blinkPromise("blue");
        }
        if (random === 3) {
            random_stack.push("green");
            await blinkPromise("green");
        }
    }
    
    buttonEnabler(true);
    
    while(buttons_enabled && TEMPO_GIOCO !== 0){
        if (TEMPO_TURNO_GIOCATORE >= 0) {
            refreshText();
            document.getElementById("displayBox").innerHTML = "Secondi rimasti per inserire i colori: " + TEMPO_TURNO_GIOCATORE;
            await delay(LIVELLO * TEMPO_COLORI);
            TEMPO_TURNO_GIOCATORE--; 
        }else{                   
            refreshText();
            for (var x = 0; x < random_stack.length; x++) {
                if (player_stack[x] !== random_stack[x]) {
                    equals = false;
                }
            }
            if (equals) {
                document.getElementById("displayBox").innerHTML = "Prossimo livello! ";
                buttonEnabler(false);
                if (LIVELLO < LIVELLO_MASSIMO) {
                    LIVELLO++;
                    cycle();
                } else {
                    document.getElementById("displayBox").innerHTML = "Hai vinto, complimenti! ";
                }

            } else {
                document.getElementById("displayBox").innerHTML = "Sbagliato!";
                buttonEnabler(false);
                cycle();
            }
        }
    }
    if(TEMPO_GIOCO === 0){
        refreshText();
        document.getElementById("displayBox").innerHTML = "Tempo esaurito, hai perso!"; 
    }
}

function buttonEnabler(enable) {

    document.getElementById("redBtn").disabled = !enable;
    document.getElementById("blueBtn").disabled = !enable;
    document.getElementById("greenBtn").disabled = !enable;
    buttons_enabled = enable;
}

function pushPlayerColor(color) {
    if(player_stack.length < random_stack.length)
    player_stack.push(color);
}

function blinkPromise(color) {
    refreshText();
    if (color === "red") {
        return new Promise(resolve => {
            document.getElementById("redCircle").style.backgroundColor = "crimson";
            setTimeout(() => {document.getElementById("redCircle").style.backgroundColor = "white";}, TEMPO_COLORI/2);
            setTimeout(() => {resolve();},TEMPO_COLORI);
        });
    }
    if (color === "blue") {
        return new Promise(resolve => {
            document.getElementById("blueCircle").style.backgroundColor = "cornflowerblue";
            setTimeout(() => {document.getElementById("blueCircle").style.backgroundColor = "white";}, TEMPO_COLORI/2);
            setTimeout(() => {resolve();},TEMPO_COLORI);
        });
    }
    if (color === "green") {
        return new Promise(resolve => {
            document.getElementById("greenCircle").style.backgroundColor = "green";
            setTimeout(() => {document.getElementById("greenCircle").style.backgroundColor = "white";}, TEMPO_COLORI/2);
            setTimeout(() => {resolve();},TEMPO_COLORI);
        });
    }
}

function delay(time){
    return new Promise(resolve => {
        setTimeout(() => {resolve();},time);
    });
}

function refreshText(){
    document.getElementById("reachedLevel").innerHTML = "Livello raggiunto: " + LIVELLO; 
    document.getElementById("timeLeft").innerHTML = "Tempo rimasto: " + TEMPO_GIOCO;
}

function startTimer(){
    if(TEMPO_GIOCO > 0)
        TEMPO_GIOCO--; 
}