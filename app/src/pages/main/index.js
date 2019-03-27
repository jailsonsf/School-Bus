import React, { Component } from 'react';
import { Link } from 'react-router-dom';

// import api from '../../services/api';

import './styles.css';

export default class Main extends Component {
    state = {
        entitys: [],
    }

    componentDidMount() {
        this.loadEntitys();
    }

    loadEntitys = () => {
        const types = ['students', 'institutions', 'drivers', 'attendants'];
        this.setState({entitys: types});
    }

    render() {
        return (
            <div className="entitys">
                {this.state.entitys.map(entity => (
                    <article key={entity}>
                        <strong>{entity}</strong>

                        <Link to={`/entitys/${entity}`}>Acessar</Link>
                    </article>
                ))}
            </div>
        );
    }
}