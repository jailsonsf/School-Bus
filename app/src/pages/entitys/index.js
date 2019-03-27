import React, {Component} from 'react';
import api from '../../services/api';

import './styles.css';

export default class Entitys extends Component {
    state = {
        entitys: [],
    }

    async componentDidMount() {
        // const {type} = this.props;
        const response = await api.get(`/students`);
        
        this.setState({entitys: response.data});
    }

    render() {
        return (
            <div className="entitys-info">
                
            </div>
        );
    }
}