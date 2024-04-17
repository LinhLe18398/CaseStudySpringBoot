import React from "react";
import ReactDOM from 'react-dom/client'
import App from "./App.jsx";
import './css/index.css';
import './js/script.js'

ReactDOM.createRoot(document.getElementById('admin')).render (
    <React.StrictMode>
        <App />
    </React.StrictMode>
)