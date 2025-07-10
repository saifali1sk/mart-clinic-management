CREATE TABLE Doctor (
  doctor_id INT PRIMARY KEY,
  name VARCHAR(100),
  specialty VARCHAR(100)
);

CREATE TABLE Patient (
  patient_id INT PRIMARY KEY,
  name VARCHAR(100),
  phone VARCHAR(15)
);

CREATE TABLE Appointment (
  appointment_id INT PRIMARY KEY,
  doctor_id INT,
  patient_id INT,
  appointment_date DATE,
  status VARCHAR(20),
  FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id),
  FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)
);

CREATE TABLE Prescription (
  prescription_id INT PRIMARY KEY,
  appointment_id INT,
  medicine TEXT,
  dosage TEXT,
  FOREIGN KEY (appointment_id) REFERENCES Appointment(appointment_id)
);
