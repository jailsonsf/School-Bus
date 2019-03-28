import React, { Component } from 'react';
import { Link } from 'react-router-dom';

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
                <article>
                    <strong>{this.state.entitys[0]}</strong>

                    <Link to={`/students`}>Acessar</Link>
                </article>
                <article>
                    <strong>{this.state.entitys[1]}</strong>

                    <Link to={`/institutions`}>Acessar</Link>
                </article>
                <article>
                    <strong>{this.state.entitys[2]}</strong>

                    <Link to={`/drivers`}>Acessar</Link>
                </article>
                <article>
                    <strong>{this.state.entitys[3]}</strong>

                    <Link to={`/attendants`}>Acessar</Link>
                </article>
            </div>
        );
    }
}