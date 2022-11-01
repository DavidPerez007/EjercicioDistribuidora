package Controlador;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;

public class Controlador implements ActionListener{
    
    private VistaRegistroDisco vistaDisco;
    private VistaRegistroLibro vistaLibro;
    private VistaMenu vistaMenu;
    
    public Controlador(VistaRegistroDisco vistaDisco, VistaRegistroLibro vistaLibro, VistaMenu vistaMenu){
        this.vistaDisco = vistaDisco;
        this.vistaLibro = vistaLibro;
        this.vistaMenu = vistaMenu;
        
        this.vistaMenu.addBooksBtn.addActionListener(this);
        this.vistaMenu.addDisksBtn.addActionListener(this);
        this.vistaMenu.printReportBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        

    }
}
