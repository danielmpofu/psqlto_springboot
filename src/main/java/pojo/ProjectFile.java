package pojo;

import lombok.Data;

import java.util.List;

@Data
public class ProjectFile {
    private String packageName;
    private String imports;
    private String fileName ;
    private String className;
    private String contents;
    private List<String> variables;
    private String absPath;

//    public String  getFileName(){
//        return this.fileName.replace(".java","Controller.java");
//    }
}