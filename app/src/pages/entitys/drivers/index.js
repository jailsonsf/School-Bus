import React, {Component} from 'react';
import api from '../../../services/api';

import './styles.css';

export default class Drivers extends Component {
    async componentDidMount() {
        const response = await api.get(`/drivers`);
        
        this.setState({entitys: response.data});

        console.log(this.state.entitys);
    }

    render() {
        return(
            <div className="entitys-info">
                <h1>Drivers</h1>
            </div>
        );
    }
}