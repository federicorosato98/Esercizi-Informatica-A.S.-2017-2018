window.onload = function(){
	//window.alert("meme");	
	fill();
};

var myJSON = '[{"mese":"Gennaio", "giorni":31}, {"mese":"Febbraio", "giorni":28}, {"mese":"Marzo", "giorni":31}, {"mese":"Aprile", "giorni":30}, {"mese":"Maggio", "giorni":31}, {"mese":"Giugno", "giorni":30}, {"mese":"Luglio", "giorni":31}, {"mese":"Agosto", "giorni":31}, {"mese":"Settembre", "giorni":30}, {"mese":"Ottobre", "giorni":31}, {"mese":"Novembre", "giorni":30}, {"mese":"Dicembre", "giorni":31}]';
var mesi_giorni = JSON.parse(myJSON);

function fill(){	
	//inserisci tutti i mesi nel select
	var meseSelect = document.getElementById('mese');
	var newMese;
	var giornoSelect = document.getElementById('giorno');
	var newGiorno;
	for(var i=0; i<=11; i++){		
		
		newMese = document.createElement("option");
		newMese.value = mesi_giorni[i].mese.toString();
		newMese.innerHTML= mesi_giorni[i].mese.toString();
		meseSelect.appendChild(newMese);
		
		for (var j = 1; j <= mesi_giorni[i].giorni; j++) {
			newGiorno = document.createElement("option");
			newGiorno.value = j.toString();
			newGiorno.innerHTML = j.toString();
			giornoSelect.appendChild(newGiorno);
		}		
	}
};

function riempiGiorni(){
	
};

