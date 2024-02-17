package Feb_16_DistributedFileSystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server
{
    private int serverId;
    private List<File> fileList=new ArrayList<>();

    Server(int serverId)
    {
        this.serverId=serverId;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public int getServerId() {
        return serverId;
    }

    public void fileExists(String fileName)
    {
        File filetoSearch=null;
        for(File file:fileList)
        {
            if(fileName.equals(file.getFileName()))
            {
                System.out.println("Yes file Exists in the Server");
                break;
            }
        }
        if(filetoSearch==null)
        {
            System.out.println("File do not exists in the server");
        }
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverId=" + serverId +
                ", fileList=" + fileList +
                '}';
    }

    }


//}
