import React, { Component } from 'react';
import Topbar from '../components/Topbar';
class HomePage extends Component { 
  constructor(props) {
  super(props);
  this.state={
   
  }
  }
 componentWillMount()
    {
              let me=this;
          
            
}

render() {

  return (
      <div id="wrapper" className="home-page-layout">
           <Topbar text="Homepage"/>
            <div className="home-container">
            
            </div>      
      </div>
  )
}



}

export default HomePage;