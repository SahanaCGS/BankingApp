import React, {useState, useEffect} from 'react';
import {DO_LOGIN} from "../apis/login";
import BankImage from "../assets/images/bankImage.jpg";
import { Button } from 'react-bootstrap';
import { useHistory } from "react-router-dom";

function ACELogin(props) {
	    const [state , setState] = useState({
        	userName : "",
        	password : "",
    	});
  let history = useHistory();

    	const handleChange = (e) => {
	        const {id , value} = e.target   
        	setState(prevState => ({
            	...prevState,
            	[id] : value
        	}))
    	}

	    return(
			    <div className="login-layout d-flex flex-column">    
			     		          	 
			          	
			        <div className="row justify-content-center flex-grow-1 login-background">  	
					
					
			        <div className="container d-flex my-auto justify-content-center align-items-center card col-5 col-lg-3 login-card">
					
						   <div>
						   	<form className="col-12" onSubmit=
									 {(e) =>{
					   				e.preventDefault();
									   	 DO_LOGIN({userName:state.userName,password:state.password},function(response){
					   				 	 	console.log(response);
					   				 	if(response ){
					   				 	 history.push({
										pathname : "/homepage"
										})
					   				 	}
					   				 }	
					   				 )	
					   				
					   				}  }>
							 
							   <h4>Welcome to Banking</h4>
					   			<div className="form-group text-left">
					   				<label htmlFor="userName h4"></label>
					   				<input type="email" 
				                       className="form-control" 
				                       id="userName" 
				                       value={state.userName}
				                       onChange={handleChange}
				                       placeholder="User Id" 
				                	/>
					   			
					   			<div className="form-group text-left">
					   				 <label htmlFor="password h4"></label>
					   				 <input type="password" 
					                       className="form-control" 
					                       id="password" 
					                   	   value={state.password}
					                       placeholder="Password"
					                       onChange={handleChange}
					                  />
					   			</div></div>
								   <div className="form-group text-left">
								   <Button className="primary" variant="primary" type="submit">LOGIN</Button>
					   			</div>
					   		</form>	

							   </div>
					</div>	
					</div>
				</div>	    	
	    )
}

export default ACELogin;