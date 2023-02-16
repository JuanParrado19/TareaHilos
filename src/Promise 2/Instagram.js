const redEstable = false
const nuevaPublicacion=()=>{
  console.log("Se abre la aplicación de instagram")
    console.log("Se abre la cámara")
    console.log("Se toma la foto")
    console.log("Se selecciona subir foto")
  subirFoto.then((respuesta)=>{
    console.log(respuesta);
    }).catch((error)=>{
        console.log(error)
    })
}

const subirFoto = new Promise((resolve,reject)=>{
  setTimeout(() => {
      if(redEstable == false){
        //<<PAR>>
        reject("La foto no pudo subirse, rla red es inestable")
      }
      resolve(`La foto "${foto}" se ha cargado correctamente.`);
    }, 2000);
})

const foto = 'FOTO AESTHETIK';

nuevaPublicacion()