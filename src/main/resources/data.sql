INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('ram', 'MALE', '1990-05-10', 'ram@example.com', 'O_POSITIVE'),
    ('sham', 'FEMALE', '1995-08-20', 'sham@example.com', 'A_POSITIVE'),
    ('ramesh', 'MALE', '1988-03-15', 'ramesh@example.com', 'A_POSITIVE'),
    ('mohan', 'FEMALE', '1992-12-01', 'mohan@example.com', 'AB_POSITIVE'),
    ('gaurav', 'MALE', '1993-07-11', 'gaurav@example.com', 'O_POSITIVE');

INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. raghav', 'Cardiology', 'raghav@example.com'),
    ('Dr. chetan', 'Dermatology', 'chetan@example.com'),
    ('Dr. amol', 'Orthopedics', 'amol@example.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
  ('2025-07-01 10:30:00', 'General Checkup', 1, 2),
  ('2025-07-02 11:00:00', 'Skin Rash', 2, 2),
  ('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
  ('2025-07-04 14:00:00', 'Follow-up Visit', 1, 1),
  ('2025-07-05 16:15:00', 'Consultation', 1, 4),
  ('2025-07-06 08:30:00', 'Allergy Treatment', 2, 5);