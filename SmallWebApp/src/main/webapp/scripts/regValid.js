	                function myFunction(){
	                    var u=document.getElementById("UName").value;
	                    var e=document.getElementById("EmailId").value;
	                    var ph=document.getElementById("Phone").value;
	                    var p1=document.getElementById("Password").value;
	                    var p2=document.getElementById("CPassword").value;
	
	                    if(u&&e&&ph&&p1&&p2)
	                    {
		                   
		                    if(!validateEmail(e)){
		                    	document.getElementById("pa1").innerHTML="Enter valid email!";
		                        document.getElementById("pa1").style.visibility="visible";
		                    }
		                    else if(ph.length!=10){
		                    	document.getElementById("pa1").innerHTML="Enter valid phone number!";
		                        document.getElementById("pa1").style.visibility="visible";
		                    }
		                     else if(p1!=p2)
		                    {
		                        document.getElementById("pa1").innerHTML="password does not match";
		                        document.getElementById("pa1").style.visibility="visible";
		                    }
		                    else{
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
