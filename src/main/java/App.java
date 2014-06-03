/**
 * Created by Miguel on 3/06/14.
 */

import com.tandem.ext.guardian.ProcessHandle;
public class App
{
    public static void main( String[] args )
    {
        try
        {
            ProcessHandle VLobjDatos = ProcessHandle.getMine();

            System.out.println("ID: " + VLobjDatos.getCPU());
            System.out.println("Proceso: " + VLobjDatos.getProcessName());
        }
        catch (Exception ex)
        {

        }
    }
}
