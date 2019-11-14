
import React, { Component } from 'react';
import {BrowserRouter, Route , Switch} from 'react-router-dom';
import './Login.css';
import { Button, Form, FormGroup, Label, Input } from 'reactstrap';
import Menu from './Menu'
class Login extends Component {
     constructor(props) {
        super(props)
        this.state = {
            username:'',
            password: '',
            check: true
    
  }      
    this.commonChange = this.commonChange.bind(this);
    this.login = this.login.bind(this);
  
  
    }
    


  commonChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        });
    }

    login()
    {
      if(`${this.state.username}`==="Meeto" && `${this.state.password}`==="sid@meeto")
      { 
        alert("Hi " + `${this.state.username}` + " Login successful");
        this.setState({check: false})
      }
      else
      {
      alert("INVALID CREDENTIALS")
      }
    }

  render() {

     return (

     <div className="login-form">
    
         { !this.state.check ? (<Menu />):null}
        <h1 className="text-center">
        <span className="font-weight-bold ">MEETO WIDE REPORT</span>
        </h1>
        <h2 className="text-center">ADMIN LOGIN</h2>
       <FormGroup>
       <Label>USERNAME</Label>
       <Input type="text" name="username" placeholder="Enter your UserName here" onChange={this.commonChange}/>
       </FormGroup>
       <FormGroup>
        <Label>PASSWORD</Label>
       <Input type="password" name="password" placeholder="Enter your PASSWORD here" onChange={this.commonChange}/>
       </FormGroup>
        <Button className="btn-lg btn-dark btn-block" onClick={this.login}>Log in</Button>


</div>

);
}
}
export default Login;



  