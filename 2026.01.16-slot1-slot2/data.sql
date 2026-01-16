USE [master]
GO
-- 0. Xóa Database PRJ30x_DB1 nếu đã tồn tại trong DBMS --------------------
IF EXISTS (
    SELECT name 
    FROM sys.databases 
    WHERE name = N'PRJ30x_DB1'
)
BEGIN
    -- Tùy chọn: đưa DB về SINGLE_USER để tránh lỗi đang có kết nối
    ALTER DATABASE [PRJ30x_DB1] SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    
    -- Xóa database
    DROP DATABASE [PRJ30x_DB1];
END
GO
/****** Object:  Database [PRJ30x_DB1]   *****/
CREATE DATABASE [PRJ30x_DB1] 
GO

USE [PRJ30x_DB1]
GO

-- Dành cho người dùng (Users)
CREATE TABLE [dbo].[tblUsers](
	[userID] [varchar](25) NOT NULL,
	[fullName] [nvarchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[roleID] [varchar](5) NOT NULL default 'NV',
	[status] [bit] NOT NULL default 0,
 CONSTRAINT [PK_tblUsers] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

-- Dữ liệu mẫu cho bảng Users (Admin, Phó Hiệu trưởng, Trưởng khoa, Giảng viên)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'admin', N'Administrator', N'1', N'QL', 1)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'super', N'Supervisor', N'1', N'QL', 1)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'pht001', N'PGS.TS Nguyễn Văn Minh', N'1', N'QL', 1)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'tk001', N'TS. Trần Thị Lan Anh', N'hcm', N'QL', 1)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'tk002', N'PGS.TS Lê Văn Đức', N'hn', N'QL', 0)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'gv001', N'ThS. Phạm Thị Hồng', N'dn', N'NV', 1)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'gv002', N'TS. Hoàng Văn Nam', N'qn', N'NV', 1)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'gv003', N'ThS. Võ Thị Mai', N'ct', N'NV', 0)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'tkk', N'ThS. Phạm Trần Hoàng Lan', N'2', N'NV', 0)
INSERT [dbo].[tblUsers] ([userID], [fullName], [password], [roleID], [status]) VALUES (N'pdt', N'TS. Nguyễn Thị Mỹ Hạnh', N'2', N'NV', 0)
GO