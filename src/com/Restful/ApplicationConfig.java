//package com.Restful;
//
//import javax.ws.rs.ApplicationPath;
//import javax.ws.rs.core.Application;
//import java.util.Set;
//
///**
// * Created by DANCO on 06/04/2017.
// */
//
//    /**
//     *
//     * @author agunga
//     *
//     */
//    @ApplicationPath("/webservice")
//    public class ApplicationConfig extends Application {
//
//        @Override
//        public Set<Class<?>> getClasses() {
//            Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
//            addRestResourceClasses(resources);
//            return resources;
//        }
//
//        /**
//         * Do not modify addRestResourceClasses() method.
//         * It is automatically populated with
//         * all resources defined in the project.
//         * If required, comment out calling this method in getClasses().
//         */
//        private void addRestResourceClasses(Set<Class<?>> resources) {
//            resources.add(com.myclasses.Resources.PatientResource.class);
//        }
//
//    }
