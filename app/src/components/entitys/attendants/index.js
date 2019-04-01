import React, {Component} from 'react';
import api from '../../../services/api';

import '../styles.css';

export default class Attendants extends Component {
    state = {
        entitys: [],
    }

    async componentDidMount() {
        const response = await api.get(`/attendants`);
        
        this.setState({entitys: response.data});
    }

    render() {
        return(
            <div className="entitys-info">
                {this.state.entitys.map(entity => (
                    <article key={entity.id}>
                        <strong>{entity.name}</strong>
                        <p>Id: {entity.id}</p>
                        <p>CPF: {entity.cpf}</p>
                        <p>RG: {entity.rg}</p>
                        <p>Idade: {entity.age}</p>
                    </article>
                ))}
            </div>
        );
    }
}