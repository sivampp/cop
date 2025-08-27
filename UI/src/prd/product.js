import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as router, useFetcher } from 'react-router-dom';
import { useEffect } from 'react';
import axios from 'axios';

export default function Product (){

    const [data, setData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        axios.get(
            "http://localhost:8001/cop/products",
            {
                headers: {
                    'Access-Control-Allow-Origin':'*',
                    'Access-Control-Allow-Methods':'GET'
                }
            }
        ).then((response) => {
            setData(response.data);
            setLoading(false);
        }).catch((err) => {
            setError(err.message);
            setLoading(false);
        })
    }, []);
    
    return(
    <div>
        Product Details Section.
        { data.map((k) => (<li>{k.name +'    ' +k.id}</li>))}
    </div>);
};