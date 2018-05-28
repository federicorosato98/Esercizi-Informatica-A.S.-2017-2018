var valute = [];
var xhttp = new XMLHttpRequest();

window.onload = function () {
    fill();
};

function fill() {
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4 && this.status === 200) {
            valute = JSON.parse(xhttp.response);
            var val1 = document.getElementById('val1');
            var newOption1;
            var val2 = document.getElementById('val2');
            var newOption2;

            for (var i = 0; i < valute.length; i++) {
                newOption1 = document.createElement("option");
                newOption2 = document.createElement("option");
                newOption1.value = valute[i].tasso_EUR;
                newOption1.innerHTML = valute[i].nomeItaliano + "\t(" + valute[i].sigla + ")";
                newOption2.value = valute[i].tasso_EUR;
                newOption2.innerHTML = valute[i].nomeItaliano + "\t(" + valute[i].sigla + ")";
                val1.appendChild(newOption1);
                val2.appendChild(newOption2);
            }
        }
    };
    xhttp.open("GET", "myJson.json", true);
    xhttp.send();
}

function converti(input){
    var before = input;
    
    if(input !== null){
        input = input * document.getElementById('val1').value;
        input = input / document.getElementById('val2').value;
        document.getElementById("ris").value = Number(before).toFixed(2) + " = " + Number(input).toFixed(2);
    }
};