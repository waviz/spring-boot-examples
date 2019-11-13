import React, { Component } from 'react';
import './Menustyle.css';
import { Link } from 'react-router-dom';


class Menu extends Component {
	render()
	{
		return(
       <div className="Menustyle">
       <ul>
       <li> <Link to="/sign"> LIST OF NEW REGISTRATION </Link> </li>
       <li> <Link to="/send"> NUMBER OF EVENT SENT TO DIFFERENT PEOPLE  </Link> </li>
       <li> <Link to="/event"> NO OF EVENTS CREATED BY DIFFERENT USERS </Link> </li>
       <li> <Link to="/reject"> NUMBER OF EVENTS REJECTED BY USERS</Link> </li>
       <li> <Link to="/login"> LOGIN </Link> </li>

       </ul>
      
	</div>);
	}

}
export default Menu;