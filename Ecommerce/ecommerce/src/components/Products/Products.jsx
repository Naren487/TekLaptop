import React from 'react'
import Grid from '@material-ui/core';
import Product from './Product/Product';
const products=[
    {id:1,name:'shoes 1',description:"casual shoes",price:'$5'},
    {id:2,name:'shoes 2',description:"casual shoes",price:'$5'},
    {id:3,name:'shoes 3',description:"casual shoes",price:'$5'},
    {id:4,name:'shoes 4',description:"casual shoes",price:'$5'},

]

const Products = () => {
    <main>
        <Grid container justify="center" spacing={4}>
            {products.map((product)=>(
                <Grid item key={product.id} xs={12}  sm={6} md={4} lg={3}>
                    <Product product={product}/>

                </Grid>
            ))}
        </Grid>
    </main>
}

export default Products