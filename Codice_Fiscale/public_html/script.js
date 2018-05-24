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
		newMese.value = i;
		newMese.innerHTML= mesi_giorni[i].mese.toString();
		meseSelect.appendChild(newMese);
		
		riempiGiorni();
	}
};

function riempiGiorni(){
	removeOptions(document.getElementById('giorno'));
	var newGiorno;
	for (var j = 1; j <= mesi_giorni[document.getElementById('mese').value].giorni; j++) {
		newGiorno = document.createElement("option");
		newGiorno.value = j.toString();
		newGiorno.innerHTML = j.toString();
		document.getElementById('giorno').appendChild(newGiorno);
	}
};

function removeOptions(selectbox)
{
    var i;
    for(i = selectbox.options.length - 1 ; i >= 0 ; i--)
    {
        selectbox.remove(i);
    }
}
function calc(){
	
	//cognome
	var cognome = document.getElementById("cognome").value;
	if(isNumeric(cognome)){
		window.alert("Il cognome contiene numeri!");
	}else{
		cognome = findConsonanti(cognome);
	}
	
	//nome
	var nome = document.getElementById("nome").value;
	if(isNumeric(nome)){
		window.alert("Il nome contiene numeri!");
	}else{
		nome = findConsonanti(nome);
	}
}

function isNumeric(n) {
	//questa funzione returna true se la stringa passata come parametro contiene dei numeri, false nel caso contrario
	var isNumeric = false;
	for (var i = 0; i < n.length; i++) {
		if(!isNaN(n.charAt(i)))
			isNumeric = true;
	}
	return isNumeric;
}

function findConsonanti(stringa){
	var consonanti = /[qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM]/;
	var trovate = [];

	for (var i = 0; i < stringa.length; i++) {
		if(consonanti.test(stringa[i]) && trovate.length < 3)
			trovate.push(stringa[i].toUpperCase());
	}
	
	if(trovate.length < 3){
		for (var j = 0; j < stringa.length; j++) {
			if (/^[a-zA-Z]+$/.test(stringa[j]) && trovate.length < 3)
				trovate.push(stringa[j].toUpperCase());
		}
	}
	
	return trovate;
}