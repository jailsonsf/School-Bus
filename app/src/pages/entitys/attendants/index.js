import React, {Component} from 'react';
import api from '../../../services/api';

import './styles.css';

export default class Attendants extends Component {

    async componentDidMount() {
        const response = await api.get(`/attendants`);
        
        this.setState({entitys: response.data});

        console.log(this.state.entitys);
    }

    render() {
        return(
            <div className="entitys-info">
                <h1>Attendants</h1>
            </div>
        );
    }
}