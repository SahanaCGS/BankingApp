import React, { Component } from 'react';
import LoginPage from './layout/login';
import HomePage from './layout/HomePage';

import { Route, Switch, HashRouter } from 'react-router-dom';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import './assets/global.scss';


const muiTheme = getMuiTheme({
	color: '#5d5d5d',
	fontFamily: 'Raleway'
});


class App extends Component {
	constructor(props) {
		super(props);
		this.state = {};
	}
	
	render() {
			return (
				<MuiThemeProvider muiTheme={muiTheme}>
						<HashRouter>
							<Switch>
								<Route exact path="/login" component={LoginPage} />
								<Route exact path="/homepage" component={HomePage} />
							</Switch>
						</HashRouter>
				</MuiThemeProvider>
			);
	}
}

export default App;
