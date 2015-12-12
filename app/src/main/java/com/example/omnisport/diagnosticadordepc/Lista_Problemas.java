package com.example.omnisport.diagnosticadordepc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;

public class Lista_Problemas extends AppCompatActivity {
    String c1;
    public Spinner problema;
    ArrayAdapter<String>Diagnostico;
    String[] opciones = new String[]{ "ELIJA LAS POSIBLES CAUSAS ", "Aparecen pantallas de error y se cierran los progrmas", "La PC se reinicia automáticamente", "Ruidos provenientes del gabinete", "La página de inicio se cambió solo ", "Poco espacio en el disco duro","La pantalla se congela","RAM defectuosa","Fuente de alimentacion defectuosa","Calentamiento de la PC","Gama de colores en pantalla", "El maus no responde","Problemas de hardware","La unidad de CD-ROM no lee sus CDS","windows no encuentra el nuevo Hardware","La PC disminuyo su rendimiento"};
     private Button btncontinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__problemas);
        problema=(Spinner) findViewById(R.id.spinner);
        btncontinuar = (Button) findViewById(R.id.button2);
        final ArrayAdapter<String>Diagnostico = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        problema.setAdapter(Diagnostico);
        problema.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                Intent I = new Intent(Lista_Problemas.this, Analisis.class);
                switch (i) {

                    case 0:
                        c1 = "Éste es el problema más habitual entre los usuarios. Pueden haber muchas razones que expliquen una baja en el rendimiento de la PC. La más común es la presencia de datos fragmentados, presencia de spyware, registro corrupto, y programas innecesarios. \n\nSolución  \nChequear los programas que tenemos instalados y desinstalar los que no usas, borrar los archivos innecesarios, ganar rendimiento, desfragmentando el disco y añadiendo memoria a la máquina.  "  ;

                        break;
                    case 1:
                        c1 = "El posible que nuestra PC tenga spyware, y que ésa sea la causa de que los programas no respondan. Tambien que el programa no funciona bien. Otra es que haya archivos de Windows necesarios para ejecutarlos y estan corruptos. Tambien puede ser la falta de memoria RAM. \n\n Solución \nActualizar un programa anti-spyware, también pueden ser drivers mal instalados. Podrías fijarte re-instalando el programa que funciona mal. Si el problema es con Windows sería recomendable  REPARAR WINDOWS, si notamos que el problema puede venir de la memoria RAM, se le puede agregar mayor memoria virtual a la PC y así optimizar su rendimiento.  ";

                        ;
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 2:
                        c1 = "Pueden ser dos. La presencia de un “gusano” (virus), o alguna obstrucción. Esto último sucede cuando la PC no puede refrescarse: antes de recalentarse, sencillamente se apaga.  \n\nSolución \nSi es un virus, correr los antivirus correspondientes. Si el problema es una obstrucción, es ncesario mantener el interior del gabinete y el cooler limpios, tener la cpu en un lugar adecuado y ventilado, Si el problema persiste, el problema puede ser la fuente de la PC, por lo que habría que chequear si ésta funciona correctamente o si está bien conectada.";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 3:
                        c1 = " Algún componente del gabinete o hardware está fallando, ya sea el cooler, la fuente, cables mal conectados, o placas mal colocadas. Aquí las causas pueden ser múltiples. \n\n Solución \nAbrir el gabinete y chequear que esté todo bien conectado. Si no encontramos ninguna anormalidad en el gabinete fijar si hay algun hardware que no funcione bien, buscar los drivers, si es muy complicado lo más conveniente es llamar al servicio técnico. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 4:
                        c1 = "Es probable que hayamos sido víctimas del “high-jacking”. Esto quiere decir que tenemos un spyware instalado en nuestra PC, que pudo haber provenido tanto de un archivo descargado y ejecutado tanto como de una red socia o lun mail.\n\nSolución\nEs probable que el spyware haya instalado un “java script” en el navegador para cambiar las opciones personales. Corriendo algún programa de diagnóstico, se puede evitar la llamada al servicio técnico ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 5:
                        c1 = "Si ya no saben porque no tiene más espacio en el disco duro, seguramente sea un problema que ustedes mismos causaron.\n\nSolución\nUna PC es una herramienta de entretenimiento, pero requiere su mantenimiento y cuidado. Intenten solo cargar programas de uso frecuente, borren los que ya no usen, o por lo menos desinstálenlos. También pueden respaldar archivos en discos externos o grabarlos en DVD para vaciar un poco la memoria del sistema. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 6:
                        c1 = "Esto es un problema muy común y puede tener dos fuentes. Puede ser un virus o puede ser sobrecalentamiento del hardware.\n\nSolución\nEn primer caso consigan un antivirus, Si el problema persiste seguramente sea que su PC se sobrecalienta. Esto se debe a un problema de hardware donde la refrigeración del gabinete no está funcionando correctamente. Prueben usar la PC con el gabinete abierto y miren si los ventiladores funcionan correctamente. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 7:
                        c1 = "principal actor en la producción de pantallas azules en el arranque del sistema. \n\n Solución \nNada mejor que  Memtest86+, la cual analizará los bancos de memoria en busca de problemas. Si encuentras errores, será necesario determinar el módulo que los está produciendo. Deberemos retirar la tapa del gabinete y remover los módulos de RAM, dejando sólo uno de ellos, el ubicado en el slot 1, en el caso de que sean más de uno. A continuación, ejecutamos Memtest86 +, y si no indica error, significará que este módulo de RAM no observa problemas, repetimos el procedimiento tantas veces como módulos poseamos.";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 8:
                        c1 = "Este es uno de los problemas que seda habitualmente cuando la fuente de poder es de una marca no muy reconocida o de baja calidad, también esto ocurre cuando no es la fuente de poder adecuada para nuestro equipo. \n\n Solución \nReemplazarla por una de mayor capacidad. Generalmente, si tenemos una PC con componentes de buen rendimiento, pero sin exagerar, una fuente de alimentación con al menos 600 Watts será suficiente. . ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 9:
                        c1 = "Es muy importante saber a qué temperatura esta nuestro computador pero es algo que pasa desapercibido en muchos casos y que trae muchos problemas a la larga cuando  este se sobre calienta. \n\n Solución \nPrimero asegurarse de que los ventiladores con que cuenta la PC estén funcionando adecuadamente. En el caso de que alguno de ellos no funcione, lo mejor será reemplazarlo. También será necesario revisar las aberturas y rejillas de ventilación para comprobar que no estén siendo obstruidos impidiendo la ventilación. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 10:
                        c1 = "Puede ser una mala conexión o simplemente la pantalla ya no funciona. \n\n Solución \nRevisa la conexión si no es eso cambia la pantalla por otra y de sistema de arranque al equipo. Si esto funciona, la pantalla anterior se dañó. Revisa OPCIONES DE PROPIEDADES DE LA PANTALLA / PANEL DE CONTROL. Selecciona \"356 colores\" en las \"propiedades estándar\". Si seleccionas \"16 colores\" la pantalla mostrará una gama limitada de colores. Si la pantalla está completamente blanca, la tarjeta de video puede estar dañada. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 11:
                        c1 = "Cuando es mouse no responde podría ser que el componente ya no funciones o podría ser también por una mala configuración. \n\n Solución \nVe a INICIO / CONFIGURACION / PANEL DE CONTROL / MOUSE. Los indicadores que aparecen a lo largo de la ventana del Mouse te permitirán controlar las funciones del Mouse. Si la configuración está correcta, verifica que el Mouse esté conectado correctamente. También puedes abrir el Mouse y limpiarlo con un copito de algodón y alcohol. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 12:
                        c1 = "El fallo de cualquier dispositivo de hardware puede afectar la operación de toda la computadora.si el disco duro no recibe energía eléctrica, no girará y el sistema operativo no podrá iniciarse. \n\n Solución \n 1. Apaga la computadora y retira todos los cables\n2. Localiza dentro de la computadora el dispositivo de hardware que no está trabajando correctamente\n3. Conecta de nuevo los cables con firmeza\n4. Cierra el gabinete de la computadora, conecta los cables externos de nuevo y reinicia el sistema. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 13:
                        c1 = "En el caso que la unidad de CD-ROM no lee sus cd la primera opción que se nos viene a la mente es que la unidad ya dio su vida útil como en muchos casos no es así. \n\n Solución\nAsegúrate que el cable no se halla soltado de la tarjeta madre. Si no es éste el problema, podría ser que tu lo deshabilitaste el Administrador de desinstalación de los dispositivos para el CD-ROM. Ve al PANEL DE CONTROL / ADMINISTRADOR DEL SISTEMA / CD-ROM y desactiva el administrador de los dispositivos. Si no es éste el problema, limpia los lentes y revisa el controlador. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 14:
                        c1 = "Este es uno de los problemas más frecuentes que tenemos en nuestras Pc ya sea por una actualización de SO o un drivers o simplemente una mala configuracion. \n\nSolución\nVerificar que el dispositivo esté correctamente instalado. Si está bien instalado, haz clic en MI PC / PROPIEDADES / ADMINSITRADOR DE DISPOSITIVOS. Encuentra el dispositivo que tiene el problema, utilice PROPIEDADES para ver cuál es el problema. Si no se soluciona, haz clic en QUITAR y reinicie el equipo. Ahora Windows debe volver a reconocer y debe instalar los controladores adecuados. ";
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                    case 15:
                        c1 = "Éste es el problema más habitual entre los usuarios. Pueden haber muchas razones que expliquen una baja en el rendimiento de la PC. La más común es la presencia de datos fragmentados, presencia de spyware, registro corrupto, y programas innecesarios. \n\nSolución  \nChequear los programas que tenemos instalados y desinstalar los que no usas, borrar los archivos innecesarios, ganar rendimiento, desfragmentando el disco y añadiendo memoria a la máquina.  "  ;
                        I.putExtra("problem", c1);
                        startActivity(I);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent I = new Intent(Lista_Problemas.this, Tipos_Mantenimiento.class);
                I.putExtra("problem", c1);
                startActivity(I);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista__problemas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
