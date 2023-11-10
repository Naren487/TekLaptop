import React from 'react'
import {Card,CardMedia,CardContent,CardActions,Typography,IconButton} from '@material-ui/core';
import {AddShoppungCart} from '@material-ui/icons';
import useStyles from "./styles";
const Product = ({product}) => {
  return (
    <Card >
        <CardMedia className={classes.root}>
            <CardMedia className={classes.media} image='' title={product.name} />
            <CardContent>
                <div className={classes.cardContent}>
                    <Typography variant="h5" gutterBottom>
                        {product.price}
                    </Typography>
                </div>
                <Typography variant='h2' color='textSecondary'>{product.description}</Typography>
            </CardContent>
            <CardActions disableSpacing className={classes.cardActions}>
                <IconButton aria-label='Add to Cart'>
                    <AddShoppungCart/>
                </IconButton>
            </CardActions>
        </CardMedia>
    </Card>
  )
}

export default Product