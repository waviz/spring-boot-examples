import React, { Component } from 'react';
import './Menustyle.css';
import { NavLink } from 'react-router-dom';


class Menu extends Component {
       state = {
     
            loggedIn: true
    
  } 
	render()
	{
		return(
       <div className="Menustyle">
       <ul>
        <li><NavLink to="/"  exact activeStyle={{color:'white'}} > HOME </NavLink> </li>
       <li> <NavLink to="/new"  exact activeStyle={{color:'white'}} > NEW REGISTRATION </NavLink> </li>
       <li> <NavLink to="/send" rexact activeStyle={{color:'white'}} > EVENT SENT TO DIFFERENT PEOPLE  </NavLink> </li>
       <li> <NavLink to="/event" exact activeStyle={{color:'white'}}  > EVENTS CREATED BY DIFFERENT USERS </NavLink> </li>
       <li> <NavLink to="/reject" exact activeStyle={{color:'white'}} > EVENTS REJECTED BY USERS</NavLink> </li>
       <li> <NavLink to="/login" exact activeStyle={{color:'white'}} > {this.state.loggedIn ? ("lOGOUT"):("LOGIN")}</NavLink> </li>

       </ul>
      
	</div>);
	}

}
export default Menu;