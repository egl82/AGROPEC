var index=0; 
var carrusel = document.getElementsByClassName('cuadrado');
var botonpausa = document.getElementById('pausa');
var int = setInterval(play, 3000); 

function play(){
	
	var c1 = carrusel[index];
	console.log('pi -->'+c1);
	var c2 ;
	
	c1.classList.remove("active");
	console.log(index);
	if (index >= 2){
		
		c2 = carrusel[0]
		index=0;
		console.log('pf -->'+c2);
		c2.classList.add("active");
	}else{
		
		
		c2 = carrusel[index+1]
		console.log('ps -->'+c2);
		index++;
		c2.classList.add("active");

	}	
}


//var int = setInterval(play, 3000); 






function plusDivs(n) {
	clearInterval(int);
  showDivs(index += n);
  int = setInterval(play, 3000);
}

function showDivs(n) {
  var i;
  var x = carrusel;
  if (n > x.length-1) {index = 0} 
  if (n < 0) {index = x.length-1} ;
  for (i = 0; i <= x.length-1; i++) {
    x[i].classList.remove("active");
  }
  x[index].classList.add("active");
 }

/* BOTON DE PAUSAR/CONTINUAR */

function pausarCarrusel(){

 if (botonpausa.innerHTML == 'continuar') {
		 botonpausa.innerHTML = 'pausar'; 
		 int = setInterval(play, 3000);		 
 } else {botonpausa.innerHTML ='continuar';
         clearInterval(int);}
}


