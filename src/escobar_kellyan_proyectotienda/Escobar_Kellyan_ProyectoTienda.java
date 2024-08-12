package escobar_kellyan_proyectotienda;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Escobar_Kellyan_ProyectoTienda {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        DecimalFormat num=new DecimalFormat("#.00");
   
       int menu=0;
       int abrircaja=0;int cajacerrada=1;int cajadinero=0;
       double invazucar=0,invmaiz=0,invtrigo=0,invavena=0;  
       int facturaazucar=0; int facturamaiz=0; int facturaavena=0; int facturatrigo=0;
       double totalpagar=0;
       int pagoproveedor=0;
      
     String productoestrella="";
     String producto1="Azucar",producto2="Avena",producto3="Trigo",producto4="Maiz";
     String posicion1="",posicion2="",posicion3="",posicion4=""; 
     int contadorventas=0,contadorcompras=0; 
     int subtotalazucar=0,subtotalavena=0,subtotaltrigo=0,subtotalmaiz=0;
     double mayorventa=0,mayorcompra=0;
     double ganancia=0;
     
   while (menu!=6){
       System.out.println("----------------------------------------------");
       System.out.println("--------------- Menu Principal ---------------");
       System.out.println("1 --------------- Abrir Caja -----------------");
       System.out.println("2 ----------------- Ventas -------------------");
       System.out.println("3 ----------------- Compras ------------------");
       System.out.println("4 ----------------- Reportes -----------------");
       System.out.println("5 --------------- Cierre De Caja -------------");
       System.out.println("6 ------------- Salir del Sistema-------------");
       System.out.println(" --------- Elija una opcion del 1 al 6 -------");
       System.out.println("----------------------------------------------");
       menu=lea.nextInt();
       switch (menu){
           //Se abrira la caja
           case 1:  
               if (cajacerrada==1){
                   System.out.println("Se abrio la caja correctamente.");
                   System.out.println("Ingrese la cantidad de efectivo para abrir la caja:");
                    double dinero=lea.nextDouble();
                    cajadinero+=dinero;
                   System.out.println("En caja hay: "+cajadinero);
                    abrircaja=1;
                    cajacerrada=1;
               }else {                 
                    if (abrircaja==0){
                System.out.println("Se abrio la caja correctamente.");
                System.out.println("Ingrese la cantidad de efectivo extra:");
                double dinero=lea.nextDouble();
                cajadinero+=dinero;
                System.out.println("En caja hay: "+cajadinero);
                while(dinero<0){
                    System.out.println("El Valor no puede ser negativo ");
                    // puedo hacer un cambio a un repetir
                    System.out.println("Ingrese la cantidad de efectivo para abrir la caja:");
                    dinero=lea.nextDouble();
                }  
                 abrircaja=1;
            }              
                 }
                    break;           
           case 2:
               if (abrircaja==0){
                   System.out.println("porfavor abrir caja antes de hacer las ventas");
               } else {
    int salirventas=0,cantidad=0,salirusuario=0; 
    facturaazucar=0;
     facturamaiz=0;    
     facturaavena=0;
     facturatrigo=0;
    double descuento=0;
    double impuesto=0,subtotal=0;
     totalpagar=0;   
     int pagoventas=0;
              while (salirventas==0){ 
               System.out.println("Ventas    | Productos |");
               System.out.println("   A      |  1,2,3,4  |");
               System.out.println("   B      |  1,2,3    |");
               System.out.println("   C      |   4       |");  
               System.out.println("--------------------------------------------");
               System.out.println("Ingrese el tipo de usuario (A - B - C) ");
               System.out.println("--------------------------------------------");
               String usuario=lea.next().toUpperCase(); 
               switch (usuario){
                   case "A":                       
                       while(salirusuario==0){
                         System.out.println("--------------- Ventas Clientes A --------------");
                         System.out.println("Codigo       | Productos | Venta   ");
                         System.out.println("   1         |  Azucar   | Lps 30  ");
                         System.out.println("   2         |  Avena    | Lps 25  ");
                         System.out.println("   3         |  Trigo    | Lps 32  ");
                         System.out.println("   4         |  Maiz     | Lps 20  ");
                         System.out.println("------------------------------------------------");
                         System.out.println("Ingrese el codigo del producto que comprara");
                       String numerproducto=lea.next();
                       if (numerproducto.equals("1") || numerproducto.equals("2")||numerproducto.equals("3")||numerproducto.equals("4")){                           
                   if (usuario.equals("A")&&numerproducto.equals("1"))   {
                     System.out.println("En este momento el inventario de azucar es: "+invazucar);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                   if (cantidad<=invazucar){
                         invazucar=invazucar-cantidad;
                         pagoventas=cantidad*30;
                         facturaazucar+=cantidad;
                             }else {
                         System.out.println("No existe suficiente inventario para la venta");
                              }
                         } 
                    if (usuario.equals("A")&&numerproducto.equals("2"))   {
                     System.out.println("En este momento el inventario de avena es: "+invavena);   
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                      if (cantidad<=invavena){
                         invavena=invavena-cantidad;
                            pagoventas=cantidad*25;
                            facturaavena+=cantidad;
                     }else {
                         System.out.println("No existe suficiente inventario para la venta");
                     } 
                    } 
                   if (usuario.equals("A")&&numerproducto.equals("3"))   {
                     System.out.println("En este momento el inventario de trigo es: "+invtrigo);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                   if (cantidad<=invtrigo){
                         invtrigo+=-cantidad;
                         pagoventas=cantidad*30;
                         facturatrigo+=cantidad;
                             }else {
                         System.out.println("No existe suficiente inventario para la venta");
                              }
                         } 
                   if (usuario.equals("A")&&numerproducto.equals("4"))   {
                     System.out.println("En este momento el inventario de maiz es: "+invmaiz);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                   if (cantidad<=invmaiz){
                         invmaiz=invmaiz-cantidad;
                         pagoventas=cantidad*30;
                         facturamaiz+=cantidad;
                             }else {
                         System.out.println("No existe suficiente inventario para la venta");
                              }
                         }   
                 }                                   
                       System.out.println("Desea hacer otra compra? (Si/No) ");
                          String respuesta=lea.next().toUpperCase();
                        if (respuesta.equals("NO")) {
                          salirventas=1;
                          salirusuario=1;
                          }
                          
                       } 
                       break;//alto para el usuario A
                   case "B":
                       while (salirusuario==0){
                        System.out.println("--------------- Ventas cliente B --------------");
                        System.out.println("Codigo       | Productos | Venta   ");
                        System.out.println("   1         |  Azucar   | Lps 30  ");
                        System.out.println("   2         |  Avena    | Lps 25  ");
                        System.out.println("   3         |  Trigo    | Lps 32  ");
                        System.out.println("-----------------------------------------------");
                        System.out.println("Ingrese el codigo del producto que comprara");
                        String numerproducto=lea.next();
                       if (numerproducto.equals("1") || numerproducto.equals("2")||numerproducto.equals("3")){
                        if (usuario.equals("B")&&numerproducto.equals("1"))   {
                     System.out.println("En este momento el inventario de azucar es: "+invazucar);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                   if (cantidad<=invazucar){
                         invazucar=invazucar-cantidad;
                         pagoventas=cantidad*30;
                         facturaazucar+=cantidad;
                             }else {
                         System.out.println("No existe suficiente inventario para la venta");
                              }
                         } 
                    if (usuario.equals("B")&&numerproducto.equals("2"))   {
                        System.out.println("En este momento el inventario de avena es: "+invavena);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                      if (cantidad<=invavena){
                         invavena=invavena-cantidad;
                            pagoventas=cantidad*25;
                            facturaavena+=cantidad;                          
                     }else {
                         System.out.println("No existe suficiente inventario para la venta");
                     } 
                    } 
                   if (usuario.equals("B")&&numerproducto.equals("3"))   {
                     System.out.println("En este momento el inventario de trigo es: "+invtrigo);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                   if (cantidad<=invtrigo){
                         invtrigo+=-cantidad;
                         pagoventas=cantidad*30;
                         facturatrigo+=cantidad;
                             }else {
                         System.out.println("No existe suficiente inventario para la venta");
                              }
                         }    
                       } 
                       System.out.println("Desea hacer otra compra? (Si/No) ");
                          String respuesta=lea.next().toUpperCase();
                        if (respuesta.equals("NO")) {
                          salirventas=1;
                          salirusuario=1;
                          }
                       }
                       break; //alto para el usuerio B
                   case "C":
                       while (salirusuario==0){
                        System.out.println("--------------- Ventas --------------");
                       System.out.println("   4         |  Maiz     | Lps 20  ");
                       System.out.println("--------------------------------------");
                     System.out.println("Ingrese el codigo del producto que comprara");
                     String numerproducto=lea.next();
                      if (numerproducto.equals("4")){
                        if(usuario.equals("C")&&numerproducto.equals("4") ){
                         System.out.println("En este momento el inventario de maiz es: "+invmaiz);
                     System.out.println("Ingrese la cantidad que comprara");
                     cantidad=lea.nextInt();
                     while (cantidad<=0){
                         System.out.println("Porfavor ingrese numeros Positivos");
                          System.out.println("Ingrese la cantidad que comprara");
                             cantidad=lea.nextInt();
                     }
                   if (cantidad<=invmaiz){
                         invmaiz=invmaiz-cantidad;
                         pagoventas=cantidad*30;
                         facturamaiz+=cantidad;
                             }else {
                         System.out.println("No existe suficiente inventario para la venta");
                              }
                         }      
                        }
                          System.out.println("Desea hacer otra compra? (Si/No) ");
                          String respuesta=lea.next().toUpperCase();
                            if (respuesta.equals("NO")){
                                salirventas=1;
                                salirusuario=1;
                                }  
                       }
                       break;
               }// fin del switch 
              
                // calculo factura                
               if (subtotal>=1000 && subtotal<5000)
               {
                   descuento=subtotal*0.05;
                    } else if (subtotal>=5000) {
                     descuento=subtotal*0.10;
                        }
               subtotal+=facturaavena*25+facturaazucar*30+facturatrigo*32+facturamaiz*20;
               impuesto=subtotal*0.07;
               totalpagar=(int)(subtotal-descuento+impuesto);
               cajadinero+=totalpagar;
               if (totalpagar>mayorventa) {
                    mayorventa=totalpagar;
                    }
               // salida pantalla (Factura)
                                  // salida pantalla (Factura)
                                   System.out.println("------------- Factura --------------");
                   System.out.println("|Cantidad en kilogramo | Nombre del Producto | Precio Unitario | Subtotal|"); 
               if (facturaazucar>=1){                    
                    System.out.println("   | "+facturaazucar+"kg     | "+"| Azucar     |"+"|     30  |"+(30*facturaazucar)+"|");  
               } 
               if (facturaavena>=1){
                      System.out.println("  | "+facturaavena+"kg     |"+"| Avena       |"+"|     25  |"+(25*facturaavena)+"|"); 
               }
               if (facturatrigo>=1){                     
                     System.out.println("|   | "+facturatrigo+"kg    |"+"| Trigo       |"+"|     32  |"+(32*facturatrigo)+"|");   
               }
               if (facturamaiz>=1){                                      
                    System.out.println("|    |  "+facturamaiz+"kg    |"+"| Maiz        |"+"|     20  |"+(20*facturamaiz)+"|");    
               }  
               
               System.out.println("-------------------------------------------------------------------------------- ");
               System.out.println(                                                     "|El Subtotal es: "+subtotal);
               System.out.println(                                                     "|El Descuento es: "+descuento);
               System.out.println(                                                     "|El impuesto es: "+num.format(impuesto)+" 7%");
               System.out.println(                                                     "|El total a pagar es: "+num.format(totalpagar));
               System.out.println(                                                     "|Saldo Actual en Caja es: "+cajadinero);
               contadorventas++;               
                   }  
               }              
               break;
           case 3:
               if (abrircaja==0){
                   System.out.println("Porfavor abrir caja antes de hacer las compras");
               } else {
          pagoproveedor=0;
         String producto=" ";
               System.out.println("--------------- Compras --------------");
               System.out.println("Codigo       | Productos | Compra  ");
               System.out.println("   1         |  Azucar   | Lps 25  ");
               System.out.println("   2         |  Avena    | Lps 20/22");
               System.out.println("   3         |  Trigo    | Lps 30  ");
               System.out.println("   4         |  Maiz     | Lps 18  "); 
               System.out.println("----------------------------------------");
               System.out.println(" proveedor| Productos |");
               System.out.println("   A      |  1,4  |");
               System.out.println("   B      |  2,3  |");
               System.out.println("   C      |   2   |");  
               System.out.println("---------------------------------------");
               System.out.println("Ingrese el nombre del proveedor(A - B - C)");
               String proveedor=lea.next().toUpperCase(); 
            switch(proveedor){
               case "A":
               System.out.println("--------------- Compras --------------");
               System.out.println("--------------- Proveedor A ----------");
               System.out.println("Codigo       | Productos | Compra  ");
               System.out.println("   1         |  Azucar   | Lps 25  ");
               System.out.println("   4         |  Maiz     | Lps 18  ");  
               System.out.println("--------------------------------------");
               System.out.println("Ingrese el codigo del producto que comprara:");
                producto=lea.next().toUpperCase();
    if (producto.equals("1") ||producto.equals("4")) {     
        if (producto.equals("1")) {
            System.out.println("Ingrese la cantidad de kg que comprara:");
             int cantidad=lea.nextInt();
            pagoproveedor=cantidad*25;
            invazucar+=cantidad;
        } else if (producto.equals("4")) {
            System.out.println("Ingrese la cantidad que comprara en kg:");
            int cantidad=lea.nextInt();
            pagoproveedor=cantidad*18;
            invmaiz+=cantidad;
        }
        if (pagoproveedor>mayorcompra) {
            mayorcompra=pagoproveedor;
            }
        if (pagoproveedor<=cajadinero) {
            cajadinero-=pagoproveedor;
            System.out.println("El costo final de la compra fue: "+pagoproveedor);
            System.out.println("El Saldo en Caja es: " + cajadinero);
            System.out.println("Transaccion completada con exito");
        } else {
            System.out.println("No se puede pagar la compra");
        }
    } else {
        System.out.println("Este proveedor no vende dicho producto");
    }
    contadorcompras++;
    break;//al proveedor A
case "B":
               System.out.println("--------------- Compras --------------");
               System.out.println("--------------- Proveedor B ----------");
               System.out.println(" Codigo      | Productos | Compra  ");
               System.out.println("   2         |  Avena    | Lps 20  ");
               System.out.println("   3         |  Trigo    | Lps 30  "); 
               System.out.println("--------------------------------------");
    System.out.println("Ingrese el codigo del producto que comprara:");
    producto=lea.next().toUpperCase();
    if (producto.equals("2") || producto.equals("3")) {
        if (producto.equals("2")) {
            System.out.println("Ingrese la cantidad de kg que comprara:");
             int cantidad=lea.nextInt();
            pagoproveedor=cantidad*20;
            invavena+=cantidad;
        } else if (producto.equals("3")) {
            System.out.println("Ingrese la cantidad de kg que comprara:");
             int cantidad =lea.nextInt();
            pagoproveedor=cantidad*30;
            invtrigo+=cantidad; 
        }
         if (pagoproveedor>mayorcompra) {
            mayorcompra=pagoproveedor;
            }
        if (pagoproveedor<=cajadinero) {
            cajadinero-=pagoproveedor;
            System.out.println("El costo final de la compra fue: " + pagoproveedor);
            System.out.println("El Saldo en caja es: " + cajadinero);
            System.out.println("Transacción completada con exito");
        } else {
            System.out.println("No se puede pagar la compra");
        }
    } else {
        System.out.println("Este proveedor no vende dicho producto");
    }
    contadorcompras++;
    break;//alto al proveedor B
case "C":
               System.out.println("--------------- Compras --------------");
               System.out.println("--------------- Proveedor C ----------");
               System.out.println("Codigo       | Productos | Compra  ");
               System.out.println("   2         |  Avena    | Lps 22  "); 
               System.out.println("--------------------------------------");
    System.out.println("Ingrese el codigo del producto que comprara:");
    producto=lea.next().toUpperCase();
    if (producto.equals("2")) {
        System.out.println("Ingrese la cantidad de kg que comprara:");
         int cantidad=lea.nextInt();
        pagoproveedor=cantidad*22;
        invavena+=cantidad;
         if (pagoproveedor>mayorcompra) {
            mayorcompra=pagoproveedor;
            }
        if (pagoproveedor<=cajadinero) {
            cajadinero-=pagoproveedor;
            System.out.println("El costo final de la compra fue: "+pagoproveedor);
            System.out.println("El Saldo en caja es: "+cajadinero);
            System.out.println("Transaccion completada con exito");            
        } else {
            System.out.println("No se puede pagar la compra");
        }
    } else {
        System.out.println("Este proveedor no vende dicho producto");
    }
     contadorcompras++;
    break;             
            }
            }
         break;
         //Area de reportes
           case 4: 
               
              System.out.println("------------------ Reportes -----------------");
               if (abrircaja==0){
                   System.out.println("Por favor, abra la caja antes de hacer los reportes.");
    } else {
                   
        // a. Cantidad Actual en Caja al momento del cierre.
           System.out.println("---------------------------------------------------------");
           System.out.println("Cantidad Actual en Caja al momento del cierre: " + cajadinero);

        // b. Numero de Compras y Ventas realizadas en el dia.
           System.out.println("---------------------------------------------------------");
           System.out.println("Numero de Compras realizadas en el dia: " + contadorcompras);
           System.out.println("Numero de Ventas realizadas en el dia: " + contadorventas);

        // c. Volumen total de Compras y Ventas efectuadas antes del cierre.
           double volumenCompras = invazucar + invavena + invtrigo + invmaiz;
           double volumenVentas = facturaazucar + facturaavena + facturatrigo + facturamaiz;
           System.out.println("---------------------------------------------------------");
           System.out.println("Volumen total de Compras efectuadas antes del cierre: " + volumenCompras);
           System.out.println("Volumen total de Ventas efectuadas antes del cierre: " + volumenVentas);
           ganancia = (volumenVentas * 30) - (volumenCompras * 25);
           System.out.println("Margen de ganancia obtenido: " + num.format(ganancia));
        
        // d. Valor Medio de Compra y Venta.
        if(contadorcompras>0){
           double valorMedioCompra = (pagoproveedor / contadorcompras);
           System.out.println("---------------------------------------------------------");
           System.out.println("Valor Medio de Compra: " + num.format(valorMedioCompra));
        }else{
            System.out.println("No se han realiado compras");
        }
        if(contadorventas>0){
           double valorMedioVenta = (totalpagar / contadorventas);
           System.out.println("Valor Medio de Venta: " + num.format(valorMedioVenta));
        }else{
            System.out.println("No se han realizado ventas");
        }
        
        // e. La venta con mayor ganancia realizada y la compra con más gasto efectuada.
               System.out.println("-----------------------------------------------------");
               System.out.println("La venta con mayor ganancia realizada: " + num.format(mayorventa));
               System.out.println("La compra con mas gasto efectuada: " + num.format(mayorcompra));

        // f. Producto Estrella.
        if (facturaazucar > 0 || facturaavena > 0 || facturatrigo > 0 || facturamaiz > 0) {
    if (facturaazucar > facturaavena && facturaazucar > facturatrigo && facturaazucar > facturamaiz) {
        productoestrella = producto1;
    } else if (facturaavena > facturaazucar && facturaavena > facturatrigo && facturaavena > facturamaiz) {
        productoestrella = producto2;
    } else if (facturatrigo > facturaazucar && facturatrigo > facturaavena && facturatrigo > facturamaiz) {
        productoestrella = producto3;
    } else {
        productoestrella = producto4;
    }
    
    if (productoestrella != null && !productoestrella.isEmpty()) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Producto Estrella: " + productoestrella + " - Cantidad en kilogramos: " + (facturaazucar + facturaavena + facturatrigo + facturamaiz));
    } else {
        System.out.println("No se ha ingresado ningun producto para determinar el producto estrella.");
    }
    } else {
    System.out.println("No se han realizado ventas.");
}
        // g. Ranking.
          int primeraCantidad = 0;
          int segundaCantidad = 0;
          int terceraCantidad = 0;
          int cuartaCantidad = 0;

          String primeraProducto = "";
          String segundaProducto = "";
          String terceraProducto = "";
          String cuartaProducto = "";

    if (facturaazucar >= facturaavena && facturaazucar >= facturatrigo && facturaazucar >= facturamaiz) {
        primeraCantidad = facturaazucar;
        primeraProducto = "Azucar";
      if (facturaavena >= facturatrigo && facturaavena >= facturamaiz) {
          segundaCantidad = facturaavena;
          segundaProducto = "Avena";
          if (facturatrigo >= facturamaiz) {
              terceraCantidad = facturatrigo;
              terceraProducto = "Trigo";
              cuartaCantidad = facturamaiz;
              cuartaProducto = "Maiz";
        } else {
            terceraCantidad = facturamaiz;
            terceraProducto = "Maiz";
            cuartaCantidad = facturatrigo;
            cuartaProducto = "Trigo";
        }
    } else if (facturatrigo >= facturaavena && facturatrigo >= facturamaiz) {
          segundaCantidad = facturatrigo;
          segundaProducto = "Trigo";
        if (facturaavena >= facturamaiz) {
            terceraCantidad = facturaavena;
            terceraProducto = "Avena";
            cuartaCantidad = facturamaiz;
            cuartaProducto = "Maiz";
        } else {
            terceraCantidad = facturamaiz;
            terceraProducto = "Maiz";
            cuartaCantidad = facturaavena;
            cuartaProducto = "Avena";
        }
    } else {
        segundaCantidad = facturamaiz;
        segundaProducto = "Maiz";
        if (facturaavena >= facturatrigo) {
            terceraCantidad = facturaavena;
            terceraProducto = "Avena";
            cuartaCantidad = facturatrigo;
            cuartaProducto = "Trigo";
        } else {
            terceraCantidad = facturatrigo;
            terceraProducto = "Trigo";
            cuartaCantidad = facturaavena;
            cuartaProducto = "Avena";
        }
      }
   } else if (facturaavena >= facturaazucar && facturaavena >= facturatrigo && facturaavena >= facturamaiz) {
       primeraCantidad = facturaavena;
       primeraProducto = "Avena";
    
   } else if (facturatrigo >= facturaazucar && facturatrigo >= facturaavena && facturatrigo >= facturamaiz) {
    primeraCantidad = facturatrigo;
    primeraProducto = "Trigo";
    
   } else {
    primeraCantidad = facturamaiz;
    primeraProducto = "Maiz";
    
  }
     System.out.println("-------------------------------------------------------------------");
     System.out.println("Ranking de productos:");
     System.out.println("1. " + primeraProducto + " - Cantidad en kilogramos: " + primeraCantidad);
     System.out.println("2. " + segundaProducto + " - Cantidad en kilogramos: " + segundaCantidad);
     System.out.println("3. " + terceraProducto + " - Cantidad en kilogramos: " + terceraCantidad);
     System.out.println("4. " + cuartaProducto + " - Cantidad en kilogramos: " + cuartaCantidad);
  }
                      
    break;
               
           case 5:              
               if (abrircaja==0||abrircaja==10){
                   System.out.println("No se puede cerrar caja mientras no se abra caja");
               } else {
                  System.out.println("La ganancia total del dia es: "+ganancia);
                  System.out.println("En caja hay: "+cajadinero);
                  System.out.println("Ingrese la cantidad de efectivo a depositar en el banco (solo se puede el 60%) :");
                double deposito=lea.nextDouble();
                double dineromax=0.6*cajadinero;
                
                //usar el while en vez de if
                while (deposito>dineromax ){
                    System.out.println("La cantidad maxima a guardar en el banco es: "+dineromax);
                    System.out.println("Ingrese una cantidad valida.");
                    System.out.println("Ingrese la cantidad de efectivo a depositar en el banco (solo se puede el 60%) :");
                   deposito=lea.nextDouble();
                }
                 while (deposito<0){
                     System.out.println("Escribir porfavor numeros positivos");
                     System.out.println("Ingrese la cantidad de efectivo a depositar en el banco(Solo se puede el 60%):");
                     deposito=lea.nextDouble();
                 }
                
                    double dinerosobrante=cajadinero-deposito;
                    cajadinero=(int) dinerosobrante;
                    System.out.println("La cantidad de efectivo sobrante en caja es: "+dinerosobrante);
                    System.out.println("Caja cerrada.No se pueden realizar mas ventas o compras."); 
                    contadorventas=0; 
                    abrircaja=0;
                //termina
               }
               break;
           case 6:   
               System.out.println("Gracias por su Visita");
               System.out.println(" Salio del programa");
        }
       }
      }
    }
