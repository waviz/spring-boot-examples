import React, { Component } from 'react';
import {BrowserRouter, Route , Switch} from 'react-router-dom';
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
       <div >
        <Menu />
        <Route path="/sign"   exact component= {NewUser} />
        <Route path="/login"  exact component= {Login} />
        <Route path="/send"   exact component= {Sender} />
        <Route path="/event"  exact component= {EventCreate} />
        <Route path="/reject" exact component= {Reject} />
       </div>
</BrowserRouter>
);
}
}
export default App;
 