import React from 'react';

import {BrowserRouter, Switch, Route} from 'react-router-dom';

import Main from './components/main/index';

import Students from './components/entitys/students/index';
import Institutions from './components/entitys/institutions/index';
import Drivers from './components/entitys/drivers/index';
import Attendants from './components/entitys/attendants/index';

const Routes = () => (
    <BrowserRouter>
        <Switch>
            <Route exact path="/" component={Main}/>
            <Route exact path="/students" component={Students}/>
            <Route exact path="/institutions" component={Institutions}/>
            <Route exact path="/drivers" component={Drivers}/>
            <Route exact path="/attendants" component={Attendants}/>
        </Switch>
    </BrowserRouter>
)

export default Routes;