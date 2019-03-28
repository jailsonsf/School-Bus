import React, {Component} from 'react';
import api from '../../../services/api';

import './styles.css';

export default class Students extends Component {
    async componentDidMount() {
        const response = await api.get(`/students`);
        
        this.setState({entitys: response.data});

        console.log(this.state.entitys);
    }

    render() {
        return(
            <div className="entitys-info">
                <h1>Students</h1>
            </div>
        );
    }
}