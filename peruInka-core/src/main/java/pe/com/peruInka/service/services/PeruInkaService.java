package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peruInka.service.util.Cliente;
import pe.com.peruInka.service.util.Person;

@Service("peruInkaService")
public class PeruInkaService {

	public static List<Person> list = new ArrayList<Person>();
	//guardar
	public String savePerson(Person person){
		String validate = "ok";
		String message="ID YA EXISTE";
		for (Person objet : list) {
			if(objet.getId().compareTo(person.getId())==0){
				validate = "ERROR";
				continue;
			}
		}
		if(validate.equals("ok")){
			list.add(person);
			message="ok";
		}
		return message;
	}
	
	
	public List<Person> findAllPerson(){
		return list;
		
	}
	//guardar2
	//modificar
	public void updatePerson(Person personUpdate){
		List<Person> listTemp = new ArrayList<Person>();
		
		for (Person person : list) {
			if(personUpdate.getId().compareTo(person.getId())==0){
				listTemp.add(personUpdate);
			}else{
				listTemp.add(person);
			}
		}
		list = new ArrayList<Person>();
		list.addAll(listTemp);

	}
	//modificar2
	//
	public Person searchPerson(Long id){
		Person personReturn = new Person();
		for (Person person : list) {
			if(id.compareTo(person.getId())==0){
				personReturn = person;
				continue;
			}
		}
		return personReturn;
	}
	//eliminar
	public void deletePerson(Long id){
		List<Person> listTemp = new ArrayList<Person>();
		
		for (Person person : list) {
			if(id.compareTo(person.getId())!=0){
				listTemp.add(person);
			}
		}
		list = new ArrayList<Person>();
		list.addAll(listTemp);
	}

	//CLIENTE
	public static List<Cliente> listC = new ArrayList<Cliente>();
	//guardar
	public String saveCliente(Cliente cliente){
		
			listC.add(cliente);
		
			return "";
		}
		
	
	
	
	public List<Cliente> findAllCliente(){
		return listC;
		
	}
	//guardar2
	//modificar
	public void updateCliente(Cliente clienteUpdate){
		List<Cliente> listCTemp = new ArrayList<Cliente>();
		


				listCTemp.add(clienteUpdate);
			
		
		listC = new ArrayList<Cliente>();
		listC.addAll(listCTemp);

	}
	//modificar2
	//
	public Cliente searchCliente(Long id){
		Cliente clienteReturn = new Cliente();
		
				
		
		return clienteReturn;
	}
	//eliminar
	public void deleteCliente(Long id){
		List<Cliente> listCTemp = new ArrayList<Cliente>();
		
		for (Cliente cliente : listC) {
			
				listCTemp.add(cliente);
			
		}
		listC = new ArrayList<Cliente>();
		listC.addAll(listCTemp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
