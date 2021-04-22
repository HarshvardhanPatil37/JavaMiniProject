        function myFunction(){
                    var p=document.getElementById("Password").value;
                    var e=document.getElementById("UEmail").value;
        
        			
                    if(p&&e)
                    {       
                    	if(!validateEmail(e)){
        					 document.getElementById("pa1").innerHTML="Enter valid email!";
		               		 document.getElementById("pa1").style.visibility="visible";
        			  	}else{         
                      		document.getElementById("form_id").submit(); 
                      }
                    }else{
                      document.getElementById("pa1").style.visibility="visible";
                    }
                }
                
         function validateEmail(email) {
	                	  const re =  /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	                	  return re.test(email);
	                }       