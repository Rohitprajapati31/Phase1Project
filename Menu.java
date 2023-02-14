package mypackage;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Menu 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int option;
		int suboption;
		System.out.println("Application Developer : Rohit");
		System.out.println("\nFile Menu Related Application");
		
		do
		{
			System.out.println("\n-------------------------------");
			System.out.println("    ===== Main Menu =====    ");
			System.out.println("-------------------------------");
			System.out.println("Choose your option");
			System.out.println("1 - Display the Current File name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			System.out.println(" ");
			option = sc.nextInt();
			switch(option)
			{
				case 1: // you need to write the logic to display the current file name
					System.out.println("You are in Case 1\n");
					
					Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
					Path path = Paths.get("D:\\Rohit\\JFSD\\Jan2023\\FinalProject\\FinalProject\\src\\mypackage\\Menu.java");
					Path fileName = path.getFileName();
					for (Path p: dirs) 
					{
						System.err.println(fileName);
					}
					break;
				
				case 2: // you need to write the logic to display the user 
						//interface to perform various operations of file
					System.out.println("You are in Case 2");
					System.out.println("Choose the operation to do..");
					System.out.println("-----------------------------");
					System.out.println("11 - Add File");
					System.out.println("12 - Delete File");
					System.out.println("13 - Search File");
					System.out.println("14 - Back to Main Menu");
					suboption = sc.nextInt();
					switch(suboption)
					{
						case 11:
							// add a file
							System.out.println("Enter the file name to add : ");
							String fName1 = sc.nextLine();
							try 
							{ 
								File addFile = new File(fName1);
								if(addFile.createNewFile())
								{
									System.out.println("File created: " + addFile.getName());
								}
								else 
								{
									System.out.println("File already exists.");
								}
							}
							catch (IOException e)
							{
								System.out.println("An error occurred.");
								e.printStackTrace();
							}
							break;
						case 12:
							// delete a file
							System.out.println("Enter the file name to delete : ");
							String fName2 = sc.next();
							File delFile = new File(fName2);
							if(delFile.delete())
							{
								System.out.println("File deleted: " + delFile.getName());
							}
							else
							{
								System.out.println("Failed to delete the file.");
							}
							break;
						case 13:
							// search a file
							System.out.println("Enter the file name to search : ");
							String fName3 = sc.next();
							
							File dir = new File("D:\\Rohit\\JFSD\\Jan2023\\FinalProject\\FinalProject");
							String[] flist = dir.list();
							int flag = 0;
							if(flist == null)
							{
								System.out.println("Empty directory.");
							}
							else
							{
								for(int i = 0; i < flist.length; i++)
								{
									String fName = flist[i];
									if(fName.equalsIgnoreCase(fName3))
									{
										System.out.println(fName + " found.");
										flag = 1;
									}
								}
							}
							if(flag == 0)
							{
								System.out.println("File not found.");
							}
						case 14:
							// return to main menu
					}
					break;
					
				case 3:
					System.out.println("You are exited from the Main Menu");
					return;
			}
//			sc.close();
		}while(true);
	}
}
