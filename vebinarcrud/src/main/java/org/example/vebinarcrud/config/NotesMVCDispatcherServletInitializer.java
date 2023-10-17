package org.example.vebinarcrud.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NotesMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected String[] getServletMappings(){
        return new String[] {"/"};
    }

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {NotesConfig.class};
    }

    @Override
    public void onStartup(ServletContext aServletContext) throws ServletException{
        super.onStartup(aServletContext);
        registerHiddenFieldFilter(aServletContext);
    }
    private void registerHiddenFieldFilter(ServletContext aContext){
        aContext.addFilter("hiddenHttpMethodFilter", new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null, true, "/*");
    }
}
