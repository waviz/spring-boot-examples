import React, { Component } from 'react';
import {BrowserRouter, Route , Switch, Redirect} from 'react-router-dom';
import './App.css';
import Sender from './Sender';
import Menu from './Menu';
import Login from './Login';
import Reject from './Reject';
import EventCreate from './EventCreate';
import NewUser from './NewUser';

class App extends Component {
  render() {
     return (
       <BrowserRouter>
      <div className="app-class">
        
        <Menu /> 
        <Switch>
        <Route path="/new"   exact strict component= {NewUser} />
        <Route path="/login"  exact strict component= {Login} />
        <Route path="/send"   exact strict component= {Sender} />
        <Route path="/event"  exact strict component= {EventCreate} />
        <Route path="/reject" exact strict component= {Reject} />
        </Switch>

       </div>
</BrowserRouter>
);
}
}
export default App;
 