import React, { Component } from 'react';
import { Button, Form, FormGroup, Label, Input } from 'reactstrap';
import './Sign.css';

class Sender extends Component {
   constructor(props) {
        super(props)
        this.state = {
            loading: true,
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
                  
  async userData(){
   const response = await fetch(`http://167.71.233.52:8090/users/sender/${this.state.dateFrom}/${this.state.dateTo}/`);
   const data = await response.json();
    this.setState({
     users: data,
     loading: false
     })
    console.log(data)
    

    //res.preventDefault();

  }

  render()
  
   {

  var id =1;
    return (

    <div className="fetch-page-sender"> 
        <h1 className="font-weight-bold text-center">MEETO WIDE REPORT</h1>
        <h3 className="text-center">ONE EVENT SENT TO DIFFERENT PEOPLE</h3>
        
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
                            <th>S.N</th>
                            <th>SENDER</th>
                            <th>EVENT ID</th>
                            <th>CREATED ON</th>
                            <th>NUMBER OF RECIPIENTS</th>
                          </tr>
                        </thead>                                        
              
{
  this.state.loading ? 
  (
  <tr className="text-center">loading...</tr>
  ):
  (
  <tbody>
  {
  this.state.users.map( (person) =>
  <tr >
  <td >{id++}</td>
  <td>{person.phone_number}</td>
  <td>{person.eventId}</td>
  <td>{person.created_on}</td>
  <td>{person.numberOfRecipents}</td>
  </tr>)
  }
  </tbody>
  )
}
</table>
  
</div>

</div>
);
  }
}
export default Sender;


                      
