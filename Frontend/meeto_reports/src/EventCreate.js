import React, { Component } from 'react';
import { Button, Form, FormGroup, Label, Input } from 'reactstrap';
import './Sign.css';

class EventCreate extends Component {
   constructor(props) {
        super(props)
        this.state = {
            users: [],
            dateFrom: '',
            dateTo: '',
    }
        this.commonChange = this.commonChange.bind(this);
        this.userData = this.userData.bind(this);
    }


   commonChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        });
    }
                  
  userData(){

     fetch(`http://167.71.233.52:8090/users/event/${this.state.dateFrom}/${this.state.dateTo}/`)
    .then(response => response.json())
    .then(res => this.setState({
     users: res
     })
   
    )

  }

  render()
  
   {

  var id =1
    return (

    <div className="fetch-page-event"> 
        <h1 className="font-weight-bold text-center">MEETO WIDE REPORT</h1>
        <h3 className="text-center">NUMBER OF EVENT CREATED BY DIFFERENT USERS</h3>
        
       <FormGroup>
       <Label className="text-bold">DateFrom</Label>
       <Input type="text" name="dateFrom" placeholder="ENTER STARTING DATE" onChange={this.commonChange}/>
       </FormGroup>

       <FormGroup>
       <Label>DateTo</Label>
       <Input type="text" name="dateTo" placeholder="ENTER CLOSING DATE " onChange={this.commonChange}/>
       </FormGroup>
        <Button className="btn-lg btn-dark btn-block" onClick={this.userData}>Enter</Button>
    <div className="container">
    <table className="table">
    <thead>
    <tr>
    <th>S.No</th>
    <th>EVENT CREATOR</th>
    <th>NUMBER OF EVENTS</th>
    </tr>
    </thead>                                        
{
  this.state.loading ? (
  <tr className="text-center">loading...</tr>
  ):(
  <tbody>{
  this.state.users.map( (person) =>
  <tr >
  <td >{id++}</td>
  <td>{person.phone_number}</td>
  <td>{person.counter}</td>
  </tr>
  )
}
</tbody>)
}

</table>
</div>
</div>
);
  }
}
export default EventCreate;


                      
