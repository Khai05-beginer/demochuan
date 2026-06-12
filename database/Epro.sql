INSERT INTO categories (name, icon, description, total_courses) VALUES
('IELTS', '🎯', 'Luyện thi IELTS Speaking, Writing, Reading và Listening.', '12 khóa học'),
('TOEIC', '📘', 'Lộ trình TOEIC từ cơ bản đến mục tiêu 700+.', '9 khóa học'),
('Giao tiếp', '💬', 'Học phản xạ, phát âm và giao tiếp hằng ngày.', '15 khóa học'),
('Business English', '💼', 'Tiếng Anh công việc, email, họp và thuyết trình.', '7 khóa học');

INSERT INTO instructors (name, role, description, total_courses, rating, avatar) VALUES
('Ms. Anna Nguyen', 'IELTS Speaking Mentor', '8+ năm kinh nghiệm giảng dạy IELTS.', '12 khóa học', '4.9',
 'https://images.unsplash.com/photo-1494790108377-be9c29b29330?q=80&w=500&auto=format&fit=crop'),
('Mr. Minh Tran', 'Business English Coach', 'Chuyên đào tạo tiếng Anh công việc.', '9 khóa học', '4.8',
 'https://images.unsplash.com/photo-1500648767791-00dcc994a43e?q=80&w=500&auto=format&fit=crop'),
('Ms. Linh Pham', 'TOEIC Trainer', 'Giảng viên TOEIC với phương pháp thực chiến.', '15 khóa học', '4.9',
 'https://images.unsplash.com/photo-1531123897727-8f129e1688ce?q=80&w=500&auto=format&fit=crop');

INSERT INTO courses (title, description, level, duration, rating, price, old_price, badge, image, status, category_id, instructor_id) VALUES
('IELTS Speaking Masterclass', 'Luyện phản xạ nói, phát triển ý và cải thiện phát âm.', 'Beginner', '24 giờ', '4.9', '899.000đ', '1.299.000đ', 'Best Seller',
 'https://images.unsplash.com/photo-1522202176988-66273c2fd55f?q=80&w=1200&auto=format&fit=crop', 'Đang bán', 1, 1),
('Business English Confidence', 'Tự tin viết email, họp và thuyết trình.', 'Intermediate', '30 giờ', '4.8', '1.099.000đ', '1.499.000đ', 'Hot',
 'https://images.unsplash.com/photo-1517048676732-d65bc937f952?q=80&w=1200&auto=format&fit=crop', 'Đang bán', 4, 2),
('TOEIC 700+ Complete Roadmap', 'Lộ trình luyện TOEIC từ nền tảng đến 700+.', 'Intermediate', '36 giờ', '4.8', '999.000đ', '1.399.000đ', 'Popular',
 'https://images.unsplash.com/photo-1523580846011-d3a5bc25702b?q=80&w=1200&auto=format&fit=crop', 'Đang bán', 2, 2),
('English Communication Foundation', 'Xây dựng nền tảng giao tiếp hằng ngày.', 'Basic', '18 giờ', '4.7', '699.000đ', '999.000đ', 'New',
 'https://images.unsplash.com/photo-1434030216411-0b793f4b4173?q=80&w=1200&auto=format&fit=crop', 'Đang bán', 3, 3),
('English Grammar From Zero', 'Học ngữ pháp từ cơ bản, dễ hiểu.', 'Beginner', '20 giờ', '4.6', '599.000đ', '899.000đ', 'Basic',
 'https://images.unsplash.com/photo-1523240795612-9a054b0db644?q=80&w=1200&auto=format&fit=crop', 'Bản nháp', 3, 3),
('Academic Writing Pro', 'Viết học thuật, phát triển lập luận.', 'Advanced', '28 giờ', '4.9', '1.199.000đ', '1.699.000đ', 'Advanced',
 'https://images.unsplash.com/photo-1519389950473-47ba0277781c?q=80&w=1200&auto=format&fit=crop', 'Đang cập nhật', 1, 1);