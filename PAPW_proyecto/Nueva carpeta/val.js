/*function Validar()
{
    var e=document.getElementById("pass").value;
    var mayusc=false;
    var numero=false;
    var minusc=false;
    var tamaño=false;

    
    if (e.length >= 8){
        for (index = 0; index < e.length; index++) {
            
            if(e.charAt(index).toUpperCase()  == e.charAt(index)  && isNaN(e.charAt(index)))
            {
               mayusc=true;
              
            }
           if (e.charAt(index).toLowerCase()  == e.charAt(index)  && isNaN(e.charAt(index)))
          {
              minusc=true;
               
          }
           if(isNaN(e.charAt(index)) == false)
           {
           
            numero=true;
           }
        }
        tamaño = true; 
    }
    if(mayusc == true && minusc == true && numero == true && tamaño == true){
      alert("funciona");
      return true;
    }
    else{
        document.getElementById("pass").style.backgroundColor=rgb(98, 162, 222);
        return false;
    }

}

function usuario()
{
    var i= document.getElementById("user").value;
    alert(i.length);
    if( i.length >=6)
    {
        alert("funciona");
        return true;
    }
    else{
     document.getElementById("user").style.backgroundColor=rgb(98, 162, 222);   
     return false;
    }
}

function both()
{
  
    var is=Validar();
    var os=usuario();
    if(is  && os )
    {
        alert("submiteado");
        //submit
    }
    else {
        alert("no submitteado");
    }

}*/


$(function()
{
    $("#enter").click(function()
    {
    var e= $("#user").text();
    console.log("erfer");
    
    });
    
    
});



 
