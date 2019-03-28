import React, {Component} from 'react';
import api from '../../../services/api';

import './styles.css';

export default class Students extends Component {
    state = {
        entitys: [],
    }

    async componentDidMount() {
        const response = await api.get(`/students`);
        
        this.setState({entitys: response.data});
    }

    render() {
        return(
            <div className="entitys-info">
                {this.state.entitys.map(entity => (
                    <article key={entity.id}>
                        <strong>{entity.name}</strong>
                        {/* <p>{entity.institution.name}</p>
                        <p>{entity.course}</p>
                        <p>{entity.age}</p> */}

                    </article>
                ))}
            </div>
        );
    }
}