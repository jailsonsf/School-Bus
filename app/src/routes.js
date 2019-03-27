import React from 'react';

import {BrowserRouter, Switch, Route} from 'react-router-dom';

import Main from './pages/main/index';
import Entitys from './pages/entitys';

const Routes = () => (
    <BrowserRouter>
        <Switch>
            <Route exact path="/" component={Main}/>
            <Route path="/entitys" component={Entitys}></Route>
        </Switch>
    </BrowserRouter>
)

export default Routes;