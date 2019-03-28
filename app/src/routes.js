import React from 'react';

import {BrowserRouter, Switch, Route} from 'react-router-dom';

import Main from './pages/main/index';
import Students from './pages/entitys/students/index';
import Institutions from './pages/entitys/institutions/index';
import Drivers from './pages/entitys/drivers/index';
import Attendants from './pages/entitys/attendants/index';

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