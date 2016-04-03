package com.aiden.computerstorepos.conf;


import com.aiden.computerstorepos.services.CPUService;
import com.aiden.computerstorepos.services.ChassisService;
import com.aiden.computerstorepos.services.DisplayCardService;
import com.aiden.computerstorepos.services.EmployeesService;
import com.aiden.computerstorepos.services.Impl.CPUServiceImpl;
import com.aiden.computerstorepos.services.Impl.ChassisServiceImpl;
import com.aiden.computerstorepos.services.Impl.DisplayCardServiceImpl;
import com.aiden.computerstorepos.services.Impl.EmployeesServiceImpl;
import com.aiden.computerstorepos.services.Impl.MainboardServiceImpl;
import com.aiden.computerstorepos.services.Impl.MemoryServiceImpl;
import com.aiden.computerstorepos.services.Impl.MonitorServiceImpl;
import com.aiden.computerstorepos.services.Impl.NotebookServiceImpl;
import com.aiden.computerstorepos.services.Impl.OpticalDevicesServiceImpl;
import com.aiden.computerstorepos.services.Impl.PCUServiceImpl;
import com.aiden.computerstorepos.services.Impl.PrinterServiceImpl;
import com.aiden.computerstorepos.services.Impl.SalesComponentsServiceImpl;
import com.aiden.computerstorepos.services.Impl.SalesServiceImpl;
import com.aiden.computerstorepos.services.Impl.SpeakerServiceImpl;
import com.aiden.computerstorepos.services.Impl.StorageDeviceServiceImpl;
import com.aiden.computerstorepos.services.MainboardService;
import com.aiden.computerstorepos.services.MemoryService;
import com.aiden.computerstorepos.services.MonitorService;
import com.aiden.computerstorepos.services.NotebookService;
import com.aiden.computerstorepos.services.OpticalDevicesService;
import com.aiden.computerstorepos.services.PCUService;
import com.aiden.computerstorepos.services.PrinterService;
import com.aiden.computerstorepos.services.SalesComponentsService;
import com.aiden.computerstorepos.services.SalesService;
import com.aiden.computerstorepos.services.SpeakerService;
import com.aiden.computerstorepos.services.StorageDeviceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Aidem.
 */
@Configuration
@Scope()
public class AppConfig {
    
    @Bean(name="CPU")  
    public CPUService getCPU(){
        return new CPUServiceImpl();
    }
    
    @Bean(name="Chassis")
    public ChassisService getChassis(){
        return new ChassisServiceImpl();
    }
    
    @Bean(name="DisplayCard")
    public DisplayCardService getDisplayCard(){
        return new DisplayCardServiceImpl();
    }
    
    @Bean(name="Employees")
    public EmployeesService getEmployees(){
        return new EmployeesServiceImpl();
    }
    
    @Bean(name="Mainboard")
    public MainboardService getMainboard(){
        return new MainboardServiceImpl();
    }
    
    @Bean(name="Memory")
    public MemoryService getMemory(){
        return new MemoryServiceImpl();
    }
    
    @Bean(name="Monitor")
    public MonitorService getMonitor(){
        return new MonitorServiceImpl();
    }
    
    @Bean(name="Notebook")
    public NotebookService getNotebook(){
        return new NotebookServiceImpl();
    }
    
    @Bean(name="OpticalDevices")
    public OpticalDevicesService getOpticalDevices(){
        return new OpticalDevicesServiceImpl();
    }
    
    @Bean(name="PCU")
    public PCUService getPCU(){
        return new PCUServiceImpl();
    }
    
    @Bean(name="Printer")
    public PrinterService getPrinter(){
        return new PrinterServiceImpl();
    }
    
    @Bean(name="Sales")
    public SalesService getSales(){
        return new SalesServiceImpl();
    }
    
    @Bean(name="SalesComponents")
    public SalesComponentsService getSalesComponents(){
        return new SalesComponentsServiceImpl();
    }
    
    @Bean(name="StorageDevice")
    public StorageDeviceService getStorageDevice(){
        return new StorageDeviceServiceImpl();
    }
    
    @Bean(name="Speaker")
    public SpeakerService getSpeaker(){
        return new SpeakerServiceImpl();
    }

}
