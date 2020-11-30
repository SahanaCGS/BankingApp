import React from 'react';
import { withRouter, Link} from "react-router-dom";

function TopBar(props) {
    return(
            <nav className="topbar">
              <h2 className="topbar-name">  {props.text}</h2>
               <div className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link to={"/bank"} className="nav-link">
                Accounts
              </Link>
            </li>
            <li className="nav-item">
              <Link to={"/add"} className="nav-link">
                Add Account
              </Link>
            </li>
          </div>
            </nav>
    )
}
export default withRouter(TopBar); 